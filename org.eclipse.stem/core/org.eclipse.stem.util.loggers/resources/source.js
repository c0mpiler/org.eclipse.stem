function toggleRow(tr, open)
{
	if (open == 1) {
		tr.style.display = 'table-row';
	} else {
		tr.style.display = 'none';
	}
}

function getVisibleStatusNode(node)
{
	var attr = node.getAttributeNode('showRow');
	if (attr == null) {
		attr = document.createAttribute('showRow')
		attr.nodeValue = '1';
		node.setAttributeNode(attr);
	}
	return attr;
}

function toggleButton(node,state)
{
	var nodeText = node.innerHTML.substring(1);

	console.log(nodeText);

	if (state == 1) {
		node.innerHTML = "-"+nodeText;
	} else {
		node.innerHTML = "+"+nodeText;
	}
}

function toggleIdentifiable(node,buttonNode)
{
	var visStatusNode = getVisibleStatusNode(node);

	var state;
	var forceClose;
	if (visStatusNode.nodeValue == 1) {
		state = 0;
		forceClose = true;
	} else {
		state = 1;
		forceClose = false;
	}

	toggleButton(buttonNode,state);

	visStatusNode.nodeValue = state;

	var tr = node;
	while (tr = tr.nextSibling) {
		if (tr.tagName == "TR") {
			if (tr.id.search('TITLE_ROW') >= 0) {
				break;
			}

			toggleRow(tr,state);

			if (tr.id.search('DUBLINCORE') >= 0) {
				toggleDublinCore(tr,false,forceClose);
				break;
			}
		}
	}    	

}

function toggleDublinCore(node, toggle, forceClose)
{
	var visStatusNode = getVisibleStatusNode(node);

	var state = 0;

	if (!forceClose) {
		if (toggle) {
			if (visStatusNode.nodeValue == 1) {
				state = 0;
			} else {
				state = 1;
			}
			visStatusNode.nodeValue = state;
		} else {
			state = visStatusNode.nodeValue;
		}
	}

	var tr = node;
	while (tr = tr.nextSibling) {
		if (tr.tagName == "TR") {
			if (tr.id.search('DUBLINCORE') < 0) {
				break;
			}

			toggleRow(tr, state);
		}
	}    			
}


function toggle(node)
{
	var titleRow = node.parentNode.parentNode;
	toggleIdentifiable(titleRow,node);
}


function collapseDublinCores()
{
	var nodes = document.getElementsByTagName('tr');
	for (var idx=0; idx<nodes.length; idx++) {
		var node = nodes[idx];
		if (node.id.search('DUBLINCORE_ROW_0') >= 0) {
			toggleDublinCore(node,true,false);
		}
	}
}

